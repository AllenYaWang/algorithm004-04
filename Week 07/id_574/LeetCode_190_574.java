package SuanFa.Week07;

/**
 * 颠倒给定的 32 位无符号整数的二进制位。
 *
 *
 *
 * 示例 1：
 *
 * 输入: 00000010100101000001111010011100
 * 输出: 00111001011110000010100101000000
 * 解释: 输入的二进制串 00000010100101000001111010011100 表示无符号整数 43261596，
 *       因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。
 *
 * 示例 2：
 *
 * 输入：11111111111111111111111111111101
 * 输出：10111111111111111111111111111111
 * 解释：输入的二进制串 11111111111111111111111111111101 表示无符号整数 4294967293，
 *       因此返回 3221225471 其二进制表示形式为 10101111110010110010011101101001。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-bits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author Neo
 */
public class LeetCode_190_574 {
    public int reverseBits(int n) {
        int res = 0;
        for (int i=0; i<32;i++) {
            res<<=1;        //左移一位
            res += n&1;     //加上n的最右一位
            n>>=1;          //n向右挪一位，保证上一行每次都获取到最右一位
        }
        return res;
    }
}