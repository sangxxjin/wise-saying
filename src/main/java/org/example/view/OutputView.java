package org.example.view;

import java.util.List;
import org.example.model.WiseSaying;

public class OutputView {

    public static final String START_MESSAGE = "== 명언 앱 ==";
    public static final String INPUT_PROMPT = "명령) ";
    public static final String FINISH_REGISTER = "번 명언이 등록되었습니다.";
    private static final String HEADER = "번호 / 작가 / 명언";
    private static final String SEPARATOR = "----------------------";


    public void showStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public void showInputPrompt() {
        System.out.print(INPUT_PROMPT);
    }

    public void showFinishRegister(int number) {
        System.out.println(number + FINISH_REGISTER);
    }

    public void showList(List<WiseSaying> wiseSayings) {
        System.out.println(HEADER);
        System.out.println(SEPARATOR);
        System.out.println(wiseSayings.size());
        StringBuilder sb = new StringBuilder();
        for (WiseSaying saying : wiseSayings) {
            sb.append(saying.getId()).append(" / ").append(saying.getAuthor()).append(" / ")
                .append(saying.getWiseSaying()).append("\n");
        }
        System.out.println(sb);
    }

}
