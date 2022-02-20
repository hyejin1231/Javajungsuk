package hello.code.ch8;

public class Ex8_11 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보 후 다시 설치하기 바랍니다. ");
        } catch (MemoryException memoryException) {
            System.out.println("에러 메시지 : " + memoryException.getMessage());
            memoryException.printStackTrace();
            System.gc();
            System.out.println("다시 설치를 시도하세요.");
        }finally {
            deleteTempFiles();
        }
    }

    private static void deleteTempFiles() {

    }

    private static void copyFiles() {

    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }
        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    private static boolean enoughMemory() {
        return true;
    }

    private static boolean enoughSpace() {
        return false;
    }
}

class SpaceException extends Exception {

    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {

    public MemoryException(String message) {
        super(message);
    }
}