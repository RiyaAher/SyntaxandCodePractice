interface PlayableInterface {
    void play(); // This is the "Contract" which can be used by any class, has only abstract methods. cannot hold normal methods.
}
class Song implements PlayableInterface { //starts with 'implements'
    @Override
    public void play() { //modified method here
        System.out.println("Streaming audio from Spotify...");
    }
}

class Video implements PlayableInterface {
    @Override
    public void play() { // modified method here
        System.out.println("Rendering 4K video frames on screen...");
    }
}

public class Main {
    public static void main(String[] args) {
        // A list of things that can be played
        PlayableInterface[] mediaQueue = { new Song(), new Video() }; //we wanna go through each class and its methods, hence we created an Array.

        for (PlayableInterface item : mediaQueue) { //for-each loop - said as - for each playableinterface item in the mediaqueue, call its respective methods. - here : means 'in'.
            item.play(); // Java calls the correct version for each!
        }
    }
}
