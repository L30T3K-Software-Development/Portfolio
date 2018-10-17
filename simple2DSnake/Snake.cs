using UnityEngine;

public class Snake : MonoBehaviour {

    private Snake next;

    public void SetNext(Snake IN)
    {
        next = IN;

    }

    public Snake GetNext()
    {
        return next;
    }
    public void removeTail()
    {
        Destroy(this.gameObject);
    }
    
}
