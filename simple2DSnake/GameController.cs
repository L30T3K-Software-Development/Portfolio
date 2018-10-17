using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GameController : MonoBehaviour {

    public int maxSize;
    public int currentSize;
    public GameObject snakePrefab;
    public Snake Head;
    public Snake Tail;
    public int NESW;
    public Vector2 nextPos;

	// Use this for initialization
	void Start () {
        InvokeRepeating("TimerInvoke", 0, .5f);
	}
	
	// Update is called once per frame
	void Update () {

        ComChangeD();
        
	}

    void TimerInvoke()
    {
        Movement();
        if(currentSize >= maxSize)
        {
            tailFunction();
        }
        else
        {
            currentSize++;
        }
    }

    void Movement()
    {
        GameObject temp;
        nextPos = Head.transform.position;
        switch (NESW)
        {
            case 0:
                nextPos = new Vector2(nextPos.x, nextPos.y + 1);
                break;
            case 1:
                nextPos = new Vector2(nextPos.x + 1, nextPos.y);
                break;
            case 2:
                nextPos = new Vector2(nextPos.x, nextPos.y - 1);
                break;
            case 3:
                nextPos = new Vector2(nextPos.x - 1, nextPos.y);
                break;
        }
        temp = (GameObject)Instantiate(snakePrefab, nextPos, transform.rotation);
        Head.SetNext(temp.GetComponent<Snake>());
        Head = temp.GetComponent<Snake>();
        return;
    }
    void ComChangeD()
    {
        if(NESW != 2 && Input.GetKeyDown(KeyCode.W))
        {
            NESW = 0;
        }
        if (NESW != 3 && Input.GetKeyDown(KeyCode.D))
        {
            NESW = 1;
        }
        if (NESW != 0 && Input.GetKeyDown(KeyCode.S))
        {
            NESW = 2;
        }
        if (NESW != 1 && Input.GetKeyDown(KeyCode.A))
        {
            NESW = 3;
        }
    }
    void tailFunction()
    {
        Snake tempSnake = Tail;
        Tail.GetNext();
        tempSnake.removeTail();
    }
}
