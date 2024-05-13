/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Steganografi;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.out;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Controller {

    int[] s = new int[256];
    int i, j;
    public byte [] encryp(byte[] plaintext, char [] pass){
    byte[] chippertext = null;
    byte[] text = plaintext;
try {
keygen (pass);
int k = 0;
File temp_file =new File("temp");
FileOutputStream out = new FileOutputStream(temp_file);
while (k < plaintext.length){
int cipher = (int)text[k] ^ keystream();
out.write((byte)cipher);
k++;
}
out.close();

chippertext = getBytesFromFile(temp_file);
}catch (Exception e){System.out.println(""+e.getMessage());

}
return chippertext;
}

    private void keygen(char[] key) {
        int temp1;
        
        
        for (i = 0; i <256; i++){
            s[i] = i;
    }
j = 0;
for (i = 0; i < 256; i++){
    j = (j + s[i] + (int) key[i % key.length]) % 256;
    temp1 = s[i];
    s[i] = s[j];
    s[i] = temp1;
}
i = j = 0;
    }

    private int keystream() {
       i = (i + 1) % 256;
       j = (j + s[i]) % 256;
       int temp1 = s[i];
       s[i] = s[j];
       s[j] = temp1;
       
       return s[(s[i] + s[j]) % 256];
    }

    private byte[] getBytesFromFile(File file) throws IOException{
        InputStream is = new FileInputStream(file);
        long length = file.length();
        byte[] bytes = new byte[(int) length];
        
        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length && (numRead = is.read 
        (bytes, offset, bytes.length - offset)) >= 0){
            offset += numRead;
        }
        if (offset < bytes.length){
            throw new IOException("could not read " + file.getName());
        }
        is.close();
        return bytes;
    }
    
    public File embed(String coverPath, String stegaName, byte [] message){
        try{
            BufferedImage image_original = ImageIO.read(new File(coverPath));
            BufferedImage image_new = user_space (image_original);
            image_new =embedding(image_new, message);
            if (image_new != null){
                new File("StegoImage").mkdir();
                setImage(image_new, new File("StegoImage/"+stegaName+".bmp"),"bmp");
                return new File("StegoImage/"+stegaName+".bmp");
            }else{
                return null;
            }
        }catch (Exception e){
            System.out.println(""+e.getMessage());
        }
        return null;
    }
        
    
    
    private BufferedImage user_space (BufferedImage image){
            BufferedImage new_img = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_3BYTE_BGR);
            Graphics2D graphics = new_img.createGraphics();
            graphics.drawRenderedImage(image, null);
            graphics.dispose();
            System.out.println("new_img: "+new_img);
            return new_img;
        }

    private BufferedImage embedding(BufferedImage image_new, byte[] text) {
        BufferedImage image = null;
        byte[] img = get_byte_data(image);
        int msgSize = text.length;
        int imgOffset = 0;
        System.out.println("panjang pesan: "+msgSize);
        if ((msgSize*8)>img.length){
            System.out.println("Pesan terlalu panjang");
            return null;
        }else{
            System.out.println("");
            System.out.println("panjang pesan: "+msgSize);
            for (int i = 31; i>=0; i--){
                if(cekBit(msgSize,i)) {
                    img[imgOffset]= (byte) (img[imgOffset] | 1);
                    System.out.println("1");
                } else{
                    img[imgOffset]= (byte)(img[imgOffset]&0xFE);
                }
                imgOffset++;
            }
        }
        konvert(img);
        return image;
}

    private void setImage(BufferedImage image_new, File file, String bmp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
private byte[] konvert(byte[] image){
    System.out.println("image 2" + image);
    return image;
}


    private byte[] get_byte_data(BufferedImage image) {
       WritableRaster raster = image.getRaster();
       DataBufferByte buffer = (DataBufferByte) raster.getDataBuffer();
        System.out.println("buffer byte :"+ buffer.getData());
        return buffer.getData();
    }
    
      private boolean cekBit(int msgSize, int i) {
        int index = 0;
        int d = msgSize >> index;
        int e = d &1 ;
        int c = ((msgSize >> index)& 1);
        if (c == 1){
            return true;
        }else {
            return false;
        }
    }

    

    byte[] extract(byte[] message, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private BufferedImage getImage(String stegoPath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class WritetableRaster {

        public WritetableRaster() {
        }
    }
    
    public byte[] extract(String stegoPath) {
    int imgOffset = 0;
    BufferedImage image = user_space(getImage(stegoPath));
    int size = 0;
    byte[] img = get_byte_data (image);
    
    Thread th = new Thread();
    try {
        th.sleep(1000);
    } catch (InterruptedException ex){
    }
    
    //getsize
    for (int i = 0; i < 32; i++){
        size = (size << 1);
        size = (size | (img[imgOffset] & 1));
        imgOffset++;
    }
    
    //getMsg
    imgOffset = 32;
    if (size < 1){
        return (null);
    } else {
        try {
            byte[] msg = new byte[size];
            
            for (int i = 0; i < size; i++){
                for (int j = 0; j < 8; j++){
                    msg[i] = (byte) (msg[i] << 1);
                    msg[i] = (byte) (msg[i] | (img[imgOffset] & 1));
                    imgOffset++;
                }
            }
            return (msg);
        } catch (Exception e) {
            return (null);
        }
    }
}
    
    public byte [] decrypt(byte[] plaintext, char[] pass) {
	byte[] ciphertext = null;
        byte [] text = plaintext;
	try{
		keygen(pass);
		int k =0;
		File temp_file=new File("temp~13477");
		FileOutputStream out = new FileOutputStream(temp_file);

		while (k < plaintext.length) {
			int cipher = (int) text[k] ^ keystream();
			out.write((byte) cipher); 
			k++;
		}
		out.close();
		ciphertext = getBytesFromFile(temp_file);
		temp_file.delete();

	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "The message cannot be decrypted", "Error",
			JOptionPane.ERROR_MESSAGE);
	}
	return ciphertext;

}

}
   