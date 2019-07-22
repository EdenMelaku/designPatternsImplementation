/*

mostly used in GUI design --- gives a way for inheritance to be a conditional add on
- each inherited class is the sum of all the parts
 */


package structuralPatterns;


interface Scene{
    void paint();
}

class SimpleScene implements Scene{

    @Override
    public void paint() {
        System.out.println("simple scene is painted");
    }
}

abstract class Shade implements Scene{

    Scene shadedScene;
    public Shade(Scene shadedScene){

        this.shadedScene=shadedScene;
    }

    @Override
    public void paint() {
        shadedScene.paint();
    }
}

class AmbientShade extends Shade{

    public AmbientShade(Scene shadedScene) {
        super(shadedScene);
    }
    @Override
    public void paint() {
        shadedScene.paint();
        System.out.println("ambient Shading applied");
    }

}

public class DecoratorPattern {

    public static void main(String ... args){
        Scene scene=new SimpleScene();
        Scene ambient=new AmbientShade(scene);
        ambient.paint();
    }

}
