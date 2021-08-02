package Exercise;

public class BufferApp {
    public static void main(String[] args) {
        Buffer.saveFile(EmailGenerator.write(Buffer.readFile()));
    }
}
