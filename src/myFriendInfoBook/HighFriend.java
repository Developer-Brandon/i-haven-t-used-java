package myFriendInfoBook;

class HighFriend extends Friend{

    String work;

    public HighFriend(String name, String phone, String addr, String job) {
        super(name, phone, addr);
        work = job;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("직업: " + work);
    }

    @Override
    public void showBasicInfo() {
        System.out.println("이름: " + name);
        System.out.println("전화번호: " + phoneNum);
    }
}
