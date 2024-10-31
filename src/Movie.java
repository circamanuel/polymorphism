public class Movie {

    private String title;
    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.ptintln(title + "is a " + instnceType + " film");
    }
}

class Adventure extends Movie {

    public Adventure(String title) {ls
            
        super(title);
    }
}