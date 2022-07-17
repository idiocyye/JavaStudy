public class nn {
    public static void main(String[] args) {
        String path=Thread.currentThread().getContextClassLoader().getResource("nn.properties").getPath();
        System.out.println(path);
    }
}
