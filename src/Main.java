import entity.*;
import handle.IdolHandle;
import handle.MemberHandle;
import handle.SongHandle;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<>();
        ArrayList<Idol> idols = new ArrayList<>();

        System.out.println("Mời b nhập số lượng bài hát muốn tọ ra");
        int numberOfSong = Integer.parseInt(scanner.nextLine());

        //Khởi tạo giá trị cho danh sách các bài hát
        SongHandle songHandle = new SongHandle();
        for (int i = 0; i < numberOfSong; i++) {
            Song song = songHandle.inputSong(scanner);
            songs.add(song);
        }

        // Khởi tạo danh sách các idol
        System.out.println("Mời b nhập số lượng các idol muốn taọ ra");
        int numberOfIdol = Integer.parseInt(scanner.nextLine());
        IdolHandle idolHandle = new IdolHandle();
        for (int i = 0; i < numberOfIdol; i++) {
            Idol idol = idolHandle.inputIdol(scanner);
            idols.add(idol);
        }

        Tiktok tiktok = new Tiktok(idols, songs);
        System.out.println(tiktok);

    }
}
