import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("==명언 앱 실행==");

		int lastId = 0;
		List<WiseSaying> wiseSayings = new ArrayList<>();

		while (true) {
			System.out.print("명령어) ");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("종료")) {
				break;
			} else if (cmd.equals("등록")) {
				int id = lastId + 1;
				System.out.print("명언 : ");
				String content = sc.nextLine().trim();
				System.out.print("작가 : ");
				String author = sc.nextLine().trim();

				WiseSaying wiseSaying = new WiseSaying(id, content, author);
				wiseSayings.add(wiseSaying);

				System.out.printf("%d번 명언이 등록되었습니다.\n", id);
				lastId++;
			} else if (cmd.equals("목록")) {
				if (wiseSayings.size() == 0) {
					System.out.println("등록된 명언이 없습니다");
				} else {
					System.out.println("  번호  /   작가   /   명언  ");
					System.out.println("==============================");

					for (int i = wiseSayings.size() - 1; i >= 0; i--) {
						WiseSaying ws = wiseSayings.get(i);

						System.out.printf("  %d   /   %s    /   %s   \n", ws.getId(), ws.getContent(), ws.getAuthor());

					}
				}
			} else if (cmd.equals("상세보기")) {
			
			} else if (cmd.equals("수정")) {
				
			} else if (cmd.equals("삭제")) {
				
			} else {
				System.out.println("명령어를 정확히 입력해주세요");
			}
		}
	}
}