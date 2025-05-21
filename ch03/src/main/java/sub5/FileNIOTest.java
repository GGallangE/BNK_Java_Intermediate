//package sub5;
//
//import java.io.IOException;
//import java.nio.ByteBuffer;
//import java.nio.channels.FileChannel;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//
//public class FileNIOTest{
//    public static void main (String[] args) throws IOException {
//
//        Path sourcepath = Path.of("C:\\Users\\busan\\Desktop\\test.txt");
//        Path targetpath = Path.of("C:\\Users\\busan\\Desktop\\test2.txt");
//
//        // 채널 생성
//        FileChannel sourceChanner = FileChannel.open(sourcepath, StandardOpenOption.READ);
//        FileChannel targetChanner = FileChannel.open(targetpath, StandardOpenOption.READ, StandardOpenOption.CREATE);
//
//        // 버퍼 생성
//        ByteBuffer buffer = ByteBuffer.allocate(1024); // 1KB
//
//        while (true){
//            int read = sourceChanner.read(buffer);
//
//            if (read == -1){
//                break;
//            }
//        }
//
//        targetChanner.write(buffer);
//
//        buffer.flip();
//        buffer.clear();
//
//        sourceChanner.close();
//        targetChanner.close();
//    }
//
//
//
//
//}
