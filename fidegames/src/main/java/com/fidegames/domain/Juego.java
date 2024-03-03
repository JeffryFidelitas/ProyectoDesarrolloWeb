
package com.fidegames.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
@Data
@Entity
@Table(name="games")
public class Juego implements Serializable {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    
    private Long id;
    private String name;
    private String console;
    private String download;
    private String rom;
    
    public Juego() {
    }

    public Juego(String name, String console, String download, String rom) {
        this.name = name;
        this.console = console;
        this.download = download;
        this.rom = rom;
    }

   
}
