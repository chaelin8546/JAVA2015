package DAO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Entity.CGangjwa;

public class CGangjwaDAO {

	public void write(CGangjwa gangjwa) {
		// TODO Auto-generated method stub
			System.out.println("과목ID : " + gangjwa.getID()+"\n");
			System.out.println("과목명: " + gangjwa.getName()+"\n");
			
			//serialize
			try {
				ObjectOutputStream Out  = new ObjectOutputStream(new FileOutputStream("gangjwa"));
				Out.writeObject(gangjwa);
				Out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}

