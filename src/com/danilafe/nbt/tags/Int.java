package com.danilafe.nbt.tags;

import java.io.FileInputStream;
import java.io.IOException;


/**
 * <i>"A single, big endian 32 bit integer" </i><br><br>
 * Reads and stores one integer.
 * @author DanilaFedorin
 * @param name The name of the tag
 * @param r The reader to use
 */
public class Int extends ValueTag{
		
	public Int(java.lang.String name, FileInputStream r){
		super(name);
		try {
			int f = r.read();
			int s = r.read();
			int t = r.read();
			int fr = r.read();
			content = (int)(f << 24 | s << 16 | t << 8| fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
