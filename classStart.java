class Rectangle {
    private int width = 0;
    private int height = 0;

    // 둘레
    public int border() {
        return 2 * this.width + 2 * this.height;
    }

    // 넓이
    public int area() {
        return this.width * this.height;
    }

    // setter,getter
    public void setWidth(int width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    // 생성자
    public Rectangle() {
    }

    public Rectangle(int lenght) {
        this(lenght, lenght);
    }

    public Rectangle(int width, int height) {
        if (width < 0 || height < 0) {
            this.width = 0;
            this.height = 0;
        }
        this.width = width;
        this.height = height;
    }
}

public class classStart {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        Rectangle re = new Rectangle(x, y);
        int area = re.area();
        int border = re.border();

        System.out.println("area=" + area + " border:" + border);

    }
}