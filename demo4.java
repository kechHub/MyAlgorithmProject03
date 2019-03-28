//青蛙跳台阶问题
public class demo4 {
	//private static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		count=frog(3);
		System.out.println("总共有"+count+"种");
	}
	public static int frog(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		if(n>1) {
			return 2*frog(n-1);
		}	
		return 0; 
	}
}


/***
  青蛙跳阶问题。
（1）一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法。
（2）一只青蛙一次可以跳上1级台阶，也可以跳上2 级……它也可以跳上n 级，此时该青蛙跳上一个n级的台阶总共有多少种跳法？
 
对于这个问题进行解答：
1. 假定青蛙跳阶的跳法以f(n)来表示，n表示阶数，即f(1)表示1阶的跳法，f(2)表示2阶的跳法...
2. 由于对于第二个问题有一次n级跳法，所以这里设定一个值f(0)=f(n-n)=1 表示n阶由一次跳上n级的跳法数为1。
 
--------------------------------------------问题（1）解答------------------------------------------------------------
问题（1）,前提只有 一次 1阶或者2阶的跳法。
a.如果两种跳法，1阶或者2阶，那么假定第一次跳的是一阶，那么剩下的是n-1个台阶，跳法是f(n-1);
b.假定第一次跳的是2阶，那么剩下的是n-2个台阶，跳法是f(n-2)
c.由a\b假设可以得出总跳法为: f(n) = f(n-1) + f(n-2) 
d.然后通过实际的情况可以得出：只有一阶的时候 f(1) = 1 ,只有两阶的时候可以有 f(2) = 2
e.可以发现最终得出的是一个斐波那契数列：
		
		| 1, (n=1)
f(n) = 	| 2, (n=2)
		| f(n-1)+f(n-2) ,(n>2,n为整数)
		
----------------------------------------------问题（2）解答------------------------------------------------------------
问题（2），前提是n个台阶会有一次n阶的跳法。分析如下:
f(1) = 1
f(2) = f(2-1) + f(2-2)         //f(2-2) 表示2阶一次跳2阶的次数。
f(3) = f(3-1) + f(3-2) + f(3-3) 
...
f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(n-(n-1)) + f(n-n) 
 
说明： 
1）这里的f(n) 代表的是n个台阶有一次1,2,...n阶的 跳法数。
2）n = 1时，只有1种跳法，f(1) = 1
3) n = 2时，会有两个跳得方式，一次1阶或者2阶，这回归到了问题（1） ，f(2) = f(2-1) + f(2-2) 
4) n = 3时，会有三种跳得方式，1阶、2阶、3阶，
	那么就是第一次跳出1阶后面剩下：f(3-1);第一次跳出2阶，剩下f(3-2)；第一次3阶，那么剩下f(3-3)
	因此结论是f(3) = f(3-1)+f(3-2)+f(3-3)
5) n = n时，会有n中跳的方式，1阶、2阶...n阶，得出结论：
	f(n) = f(n-1)+f(n-2)+...+f(n-(n-1)) + f(n-n) => f(0) + f(1) + f(2) + f(3) + ... + f(n-1)
	
6) 由以上已经是一种结论，但是为了简单，我们可以继续简化：
	f(n-1) = f(0) + f(1)+f(2)+f(3) + ... + f((n-1)-1) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2)
	f(n) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2) + f(n-1) = f(n-1) + f(n-1)
	可以得出：
	f(n) = 2*f(n-1)
	
7) 得出最终结论,在n阶台阶，一次有1、2、...n阶的跳的方式时，总得跳法为：
		| 1       ,(n=0 ) 
f(n) = 	| 1       ,(n=1 )
		| 2*f(n-1),(n>=2)
 
 
 
 
 ***/