package handle;

import entity.Song;

import java.util.Scanner;

public class SongHandle {
    public Song inputSong(Scanner scanner){
        System.out.println("Mời b nhập tên bài hát: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập tên ca sỹ: ");
        String singer = scanner.nextLine();
        return new Song(name, singer);
    }
}
