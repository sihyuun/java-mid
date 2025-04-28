package etc.orderEx1;

public abstract class MenuStore {

    //메뉴 추가 시 변하는 부분
    public static Menu findMenu(String option) {
        if (option.equals("a")) {
            return new AMenu();
        } else if (option.equals("b")) {
            return new BMenu();
        } else {
            return new DefaultMenu();
        }
    }

}
