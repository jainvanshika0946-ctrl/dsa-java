public class settingsManager {
    public static void main(String[] args) {
        int s = 5;
        System.out.println(turnOn(s,1));     // 0111=7
        System.out.println(turnOff(s,2));   // 0001 = 1
        System.out.println(toggle(s,1));   // 0111 = 7
    }
    static int turnOn ( int s , int n ) {
        return s | ( 1 << n ) ;
    }
    static int turnOff ( int s , int n ) {
        return s & ~( 1 << n ) ;
    }
    static int toggle ( int s, int n ) {
        return s ^ ( 1 << n ) ;
    }
}
//You are building a settings manager for an app.
//Each user's preferences are stored in a single integer where each bit is a toggle:
//Bit 0 → Dark mode
//Bit 1 → Notifications
//Bit 2 → Auto-save
//Bit 3 → Location access
//You need to write THREE utility methods:
//java// 1. Turn ON a specific setting (set bit to 1)
//static int turnOn(int settings, int bit)
//
/// / 2. Turn OFF a specific setting (set bit to 0)
//static int turnOff(int settings, int bit)
//
//// 3. Toggle a setting (if 1→0, if 0→1)
//static int toggle(int settings, int bit)