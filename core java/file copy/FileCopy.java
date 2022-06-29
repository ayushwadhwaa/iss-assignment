import java.io.*;
class FileCopy{
	public static void main(String[] args) throws Exception{
		File inFile = new File("filedemo\\Sample.txt");
		File outFile = new File("filedemo\\Output.txt");
		FileInputStream ins = null;
		FileOutputStream outs = null;
		try{
			ins = new FileInputStream(inFile);
			outs = new FileOutputStream(outFile);
			int b;
			while((b=ins.read())!=-1)
				outs.write(b);
			System.out.println("File Copied"); 
		}
		catch(FileNotFoundException e){
			System.out.println("Desired File is not present!"+e);
		}
		catch(IOException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println("Something which i forgot to catch"+e);
		}
		finally{
			ins.close();
			outs.close();
		}
	}
}