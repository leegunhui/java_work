package exam;

import java.util.ArrayList;
import java.util.Scanner;

class PersonFunction {
    ArrayList<Person> personList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void personFunc() {
        while (true) {
            System.out.println("\n1. 정보추가");
            System.out.println("2. 정보삭제");
            System.out.println("3. 전체정보");
            System.out.println("4. 종료");
            System.out.print("항목선택: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    removePerson();
                    break;
                case 3:
                    viewAllPersons();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
        }
    }

    private void addPerson() {
        System.out.println("-----정보추가-----");
        System.out.print("이름: ");
        String name = sc.nextLine();
        
        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine();
        
        System.out.print("전화: ");
        String phone = sc.nextLine();

        personList.add(new Person(name, age, phone));
        System.out.println("정보가 저장되었습니다.");
    }

    private void removePerson() {
        System.out.println("삭제할 이름 입력하세요: ");
        String name = sc.nextLine();
        
        boolean found = false;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals(name)) {
                personList.remove(i);
                System.out.println(name + " 삭제됨.");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("이름이 리스트에 없음.");
        }
    }

    
     private void viewAllPersons() {
    	 if(personList.isEmpty()) {
    		 System.out.println("등록된 정보가 없습니다.");
    		 return;
    	 }
    	 System.out.println("----전체정보----");
    	 System.out.println("등록인원 : " + personList.size()+"명");
    	 
    	 for(Person p: personList) {
    		 System.out.println("이름: " + p.getName());
    		 System.out.println("나이: " + p.getAge());
    		 System.out.println("전화: " + p.getPhone());
    	 }
     }
}