package striverSDEsheet.string1;

public class rollingHashRabinKarp {
    // d is the number of characters in the input alphabet
    public final static int d = 256;

    /* pat -> pattern
        txt -> text
        q -> A prime number
    */
    public static void main(String[] args) {
        String txt = "abcdabcdabcd";
        String pat = "cdabcdab";

        // A prime number
        int q = 101;

        // Function Call
        search(pat, txt, q);
    }
    static void search(String pat, String txt, int q)
    {
        int M = pat.length();
        int N = txt.length();
        int i, j;
        int p = 0; // hash value for pattern
        int t = 0; // hash value for txt
        int h = 1;

        // The value of h would be "pow(d, M-1)%q"
        // this is working as 256-base no system
        // like in 10-base system we multiply nth place with 10^n
        // similarly in 256-base no system we multiply nth place with 256^n (d=256)
        // %q is taken to limit no to integer more about it at bottom
        for (i = 0; i < M-1; i++)
            h = (h*d)%q;

        // Calculate the hash value of pattern and first
        // window of text
        for (i = 0; i < M; i++)
        {
            p = (d*p + pat.charAt(i))%q;
            t = (d*t + txt.charAt(i))%q;
        }

        // Slide the pattern over text one by one
        for (i = 0; i <= N - M; i++)
        {

            // Check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters one by one
            if ( p == t )
            {
                /* Check for characters one by one */
                for (j = 0; j < M; j++)
                {
                    if (txt.charAt(i+j) != pat.charAt(j))
                        break;
                }

                // if p == t and pat[0...M-1] = txt[i, i+1, ...i+M-1]
                if (j == M)
                    System.out.println("Pattern found at index " + i);
            }

            // Calculate hash value for next window of text: Remove
            // leading digit, add trailing digit
            if ( i < N-M )
            {
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+M))%q;

                // We might get negative value of t, converting it
                // to positive
                if (t < 0)
                    t = (t + q);
            }
        }
    }
}
/*
//        both method are same

//        meathod-1
//        here we multiply an element 3 times and then took their remainder

        double oneshot = (26*26*26)%101;
        System.out.println(oneshot);   // ans-> 2

//        meathod-2
//        here we took an ele and devided it to find its remainder
//        and multiplied the remainder with ele and again took the remainder
//        repeated the process 3 times

        int h=1;
        for (int i = 0; i < 3; i++) {
            h = (h * 26) % 101;
        }
        System.out.println(h);  // ans->2

*/
