package myFriendInfoBook;

class UnivFriend extends Friend{
    String major;

    public UnivFriend(String name, String phone, String addr, String major) {
        super(name, phone, addr);
        this.major = major;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("전공: " + major);
    }

    @Override
    public void showBasicInfo() {
        super.showBasicInfo();
        System.out.println("이름: " + name);
        System.out.println("전화: " + phoneNum);
        System.out.println("전공: " + major);
    }
}
