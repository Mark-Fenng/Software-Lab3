package vertex;

public class Movie extends Vertex {
    private int year; // 电影上映年份
    private String country; // 电影的拍摄国家
    private double IMDB; // IMDB上面的电影评分

    public Movie(String label) {
        super(label);
    }

    @Override
    public void fillVertexInfo(String[] args) {
        if (args.length == 3) {
            year = Integer.parseInt(args[0]);
            country = args[1];
            IMDB = Double.parseDouble(args[2]);
        } else {
            throw new RuntimeException("form of the file is wrong!");
        }
    }
}
