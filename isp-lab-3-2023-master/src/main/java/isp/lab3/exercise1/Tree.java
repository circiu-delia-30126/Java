package isp.lab3.exercise1;

public class Tree {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public Tree(int height) {
        this.height = 15;
    }

        public void grow(int meters)
        {
            if (meters >= 1)
                this.height += meters;


        }

        @Override
        public String toString () {
            return "Tree{" +
                    "height=" + height +
                    '}';
        }
    }