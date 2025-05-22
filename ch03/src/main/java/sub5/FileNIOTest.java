package sub5;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileNIOTest {

    public static void main(String[] args) throws IOException {

        Path sourcePath = Path.of("C:\\Users\\busan\\Desktop\\Sample.tif");
        Path targetPath = Path.of("C:\\Users\\busan\\Desktop\\Sample21.tif");

        // 채널 생성
        FileChannel sourceChanner = FileChannel.open(sourcePath, StandardOpenOption.READ);
        FileChannel targetChanner = FileChannel.open(targetPath, StandardOpenOption.WRITE, StandardOpenOption.CREATE);

        // 버퍼 생성
        ByteBuffer buffer = ByteBuffer.allocate(1024); // 1KB

        while (true) {

            int read = sourceChanner.read(buffer);

            if(read == -1){
                break;
            }

            buffer.flip(); // 쓰기모드를 읽기모드 전환
            targetChanner.write(buffer);

            buffer.clear();
        }

        // 채널 닫기
        sourceChanner.close();
        targetChanner.close();

        System.out.println("Done");
    }
}