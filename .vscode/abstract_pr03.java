interface TvRemote{
    void singnal();
}

interface SmartTvRemote extends TvRemote{
    void Automatic();
}
class SmartTvRemote2 implements SmartTvRemote{
    public void singnal(){
        System.out.println("singnal are coming");
    }
    public void Automatic(){
        System.out.println("Automatic connected");
    }
}


public class abstract_pr03 {
    public static void main(String args[]){
    SmartTvRemote t = new SmartTvRemote2();
    t.singnal();
    t.Automatic();
    }
}
