//file 1
package music;
interface Playable
  {
     void play();
  }

//file 2
package music.string;
import music.playable;

public class Veena implements Playable
  {
    @Override
    void play()
    {
     System.out.println("Veena Playing veena"); 
    }
  }
    
//file 3
package music.wind;
import music.playable;

public class Sexaphone implements Playable
  {
    @Override
    void play()
    {
    System.out.println("Venna playing Sexaphone");
    }
  }
//file 4
package live;
import music.playable;
imporrt music.string.Veena;
import music.wind.Sexaphone;
public class Test
  {
    public static void main(String [] args)
    {
      Veena v1 = new Veena();
      v1.play();
      Sexaphone s1 = new Sexaphone();
      s1.play();
      Playable p;
      p=new Veena();
      p.play();
      p=new Sexaphone();
      p.play();
      
  }
  }
