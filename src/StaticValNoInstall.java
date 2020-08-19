class InstCnt {
    static int instNum = 100;

    public InstCnt() {
        instNum++;
        System.out.println("인스턴스 생성 : " + instNum);
    }
}


public class StaticValNoInstall {
    public static void main(String[] args) {
        InstCnt.instNum -= 15;
        System.out.println("인스턴스 생성 안하고 접근이 가능할까? : " + InstCnt.instNum);
    }
}
