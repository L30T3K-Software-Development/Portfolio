
using UnityEngine;

public class generateTerrain : MonoBehaviour
{

    public int width = 256;
    public int length = 256;
    public int depth = 20;
    public float Scale = 20f;

    private void Start()
    {
        Terrain terr = GetComponent<Terrain>();
        terr.terrainData = GenerateTerrain(terr.terrainData);
    }
    TerrainData GenerateTerrain(TerrainData terrainData)
    {
        terrainData.heightmapResolution = width + 1;
        terrainData.size = new Vector3(width, depth, length);
        terrainData.SetHeights(0, 0, generateHeights());
        return terrainData; 
    }
    float[,] generateHeights()
    {
        float[,] heights = new float[width, length];
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < length; y++)
            {
                heights[x, y] = CalculateHeight(x, y);
            }

        }
        return heights;
    }
    float CalculateHeight(int x, int y)
    {
        float xCoOrd = (float)x / width * Scale;
        float yCoOrd = (float)y / length * Scale;
        return Mathf.PerlinNoise(xCoOrd, yCoOrd);
    }
}
