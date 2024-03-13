package HeadFirst;

public class DrumKitTestDrive {
    public static void main(String[] s)
    {
        
        DrumKit d = new DrumKit();

        if(d.snare==true)
        {
            d.playSnare();
        }
        d.snare= false;
        d.playTopHat();
    }
}
