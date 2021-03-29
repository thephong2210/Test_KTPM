import java.util.*;

class MaHoaSubstitution
{
    public static final String str="abcdefghijklmnopqrstuvwxyz";
    
    public static String MaHoa(String plainText,int key)
    {
        plainText = plainText.toLowerCase();
        
        String cipherText = "";
        
        for(int i=0;i<plainText.length();i++)
        {
            int charpos = str.indexOf(plainText.charAt(i));
            int keyVal = (charpos+key)%26;
            char replaceVal = str.charAt(keyVal);
            cipherText = cipherText + replaceVal;
        }
        
        return cipherText;
    }


    public static String GiaiMa(String cipherText,int key)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for(int i=0;i<cipherText.length();i++)
        {
            int charpos = str.indexOf(cipherText.charAt(i));
            int keyval=(charpos-key)%26;
            if(keyval<0)
            {
                keyval=str.length() + keyval;
            }
            char replaceval = str.charAt(keyval);
            plainText = plainText+replaceval;
        }
        return plainText;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi plain text:");
        String msg=sc.nextLine();
        
        System.out.println("Nhap key:");
        String key=sc.nextLine();
        
        int k=Integer.parseInt(key);    
        
        System.out.println("Chuoi ma hoa: ");
        System.out.println(MaHoa(msg,k));
        System.out.println("Chuoi giai ma:");
        System.out.println(GiaiMa(MaHoa(msg,k),k));

    }

}