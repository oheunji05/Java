public class Order {
    String ordernum;
    String orderid;
    String orderdate;
    String ordername;
    String orderpronum;
    String orderadd;

    public static void main(String[] args) {
        Order order=new Order();
        order.ordernum="201803120001";
        order.orderid="abc123";
        order.orderdate="2018년 3월 12일";
        order.ordername="홍길순";
        order.orderpronum="PD0345-12";
        order.orderadd="서울시 영등포구 여의도동 20번지";

        System.out.printf("주문번호 : %s\n",order.ordernum);
        System.out.printf("주문자 아이디 : %s\n",order.orderid);
        System.out.printf("주문 날짜 : %s\n",order.orderdate);
        System.out.printf("주문자 이름 : %s\n",order.ordername);
        System.out.printf("주문 상픔 번호 : %s\n",order.orderpronum);
        System.out.printf("배송 주소 : %s\n",order.orderadd);
    }
}
