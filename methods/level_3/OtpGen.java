package level_3;

import java.util.HashSet;
import java.util.Set;

public class OtpGen {
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false; 
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }

        boolean unique = areOTPsUnique(otps);
        System.out.println("Are all OTPs unique? " + unique);
    }
}
