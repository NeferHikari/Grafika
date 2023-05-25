package graf.grafika1;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files

public class FileReader {
    private List<Cube> cubeList;
    private double widht=700;
    private double height=700;
    private List<Point> pointList;
    public FileReader() {
        try {
            cubeList=new ArrayList<>();
            pointList=new ArrayList<>();
            File myObj = new File("points.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextDouble()) {
                Double x = myReader.nextDouble();
                Double y = myReader.nextDouble();
                Double z = myReader.nextDouble();
                Point newPoint=new Point(x,y,z);
                pointList.add(newPoint);
                if(pointList.size()==8){
                    Cube newCube=new Cube(pointList.get(0),pointList.get(1),pointList.get(2),pointList.get(3),pointList.get(4),pointList.get(5),pointList.get(6),pointList.get(7));
                    cubeList.add(newCube);
                    pointList= new ArrayList<>();
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public List<Cube> getCubeList() {
        return cubeList;
    }
}