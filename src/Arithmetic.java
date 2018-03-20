import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Arithmetic {

	/**
	 * 提前将 符号的优先级定义好
	 */
	private static final Map<Character, Integer> basic = new HashMap<Character, Integer>();
	static {
		basic.put('-', 1);
		basic.put('+', 1);
		basic.put('*', 2);
		basic.put('/', 2);
		basic.put('(', 0);
	}

	/**
	 * 得到计算式的字符串
	 */
	public String getString() {
		String[] operate = new String[] { "+", "-", "*", "/" };
		int[] number = new int[101];
		for (int i = 0; i <= 100; i++)
			number[i] = i;
		int[] type = new int[3];
		for (int i = 0; i < 3; i++)
			type[i] = i;
		Random r = new Random();
		int t = type[r.nextInt(3)];
		if (t == 0){
			String  str1 = operate[r.nextInt(4)];
			String  str2 = operate[r.nextInt(4)];
			if (str1.equals(str2))
				return null;
			else 
				return number[r.nextInt(101)] + str1 + number[r.nextInt(101)] + str2
						+ number[r.nextInt(101)];			
		}
		else if (t == 1){
			String  str1 = operate[r.nextInt(4)];
			String  str2 = operate[r.nextInt(4)];
			String  str3 = operate[r.nextInt(4)];
			if(str1.equals(str2)&&str1.equals(str3))
				return null;
			else 
				return number[r.nextInt(101)] + str1 + number[r.nextInt(101)] + str2
						+ number[r.nextInt(101)] + str3 + number[r.nextInt(101)];
		}
		else{
			String  str1 = operate[r.nextInt(4)];
			String  str2 = operate[r.nextInt(4)];
			String  str3 = operate[r.nextInt(4)];
			String  str4 = operate[r.nextInt(4)];
			if(str1.equals(str2)&&str1.equals(str3)&&str1.equals(str4))
				return null;
			else
				return number[r.nextInt(101)] + str1 + number[r.nextInt(101)] + str2
						+ number[r.nextInt(101)] + str3 + number[r.nextInt(101)] + str4
						+ number[r.nextInt(101)];
		}
			
	}

	/**
	 * 将 中缀表达式 转化为 后缀表达式
	 */
	public String toSuffix(String infix) {
		if(infix==null)
			return null;
		List<String> queue = new ArrayList<String>();// 定义队列 用于存储 数字 以及最后的 后缀表达式
		List<Character> stack = new ArrayList<Character>();// 定义栈 用于存储 运算符,最后stack中会被 弹空

		char[] charArr = infix.trim().toCharArray();// 字符数组 用于拆分数字或符号
		String standard = "*/+-()"; // 判定标准 将表达式中会出现的运算符写出来
		char ch = '&';// 在循环中用来保存 字符数组的当前循环变量的 这里仅仅是初始化一个值 没有意义
		int len = 0;// 用于记录字符长度 【例如100*2,则记录的len为3 到时候截取字符串的前三位就是数字
		for (int i = 0; i < charArr.length; i++) {// 开始迭代

			ch = charArr[i]; // 保存当前迭代变量
			if (Character.isDigit(ch)) { // 如果当前变量为 数字
				len++;
			} else if (Character.isLetter(ch)) {// 如果当前变量为 字母
				len++;
			} else if (ch == '.') {// 如果当前变量为 . 会出现在小数里面
				len++;
			} else if (Character.isSpaceChar(ch)) {// 如果当前变量为 空格 支持表达式中有空格出现
				if (len > 0) {// 若为空格 代表 一段结束 ，就可以往队列中 存入了 【例如100 * 2 100后面有空格
								// 就可以将空格之前的存入队列了】
					queue.add(String.valueOf(Arrays.copyOfRange(charArr, i - len, i)));// 往队列存入截取的字符串
					len = 0;// 长度置空
				}
				continue;// 如果空格出现，则一段结束 跳出本次循环
			} else if (standard.indexOf(ch) != -1) { // 如果是上面标准中的 任意一个符号
				if (len > 0) { // 长度也有
					queue.add(String.valueOf(Arrays.copyOfRange(charArr, i - len, i)));// 说明符号之前的可以截取下来做数字
					len = 0;// 长度置空
				}
				if (ch == '(') {// 如果是左括号
					stack.add(ch);// 将左括号 放入栈中
					continue; // 跳出本次循环 继续找下一个位置
				}
				if (!stack.isEmpty()) {// 如果栈不为empty
					int size = stack.size() - 1;// 获取栈的大小-1 即代表栈最后一个元素的下标
					boolean flag = false;
					while (size >= 0 && ch == ')' && stack.get(size) != '(') {
						queue.add(String.valueOf(stack.remove(size)));
						size--;
					}
					while (size >= 0 && !flag && basic.get(stack.get(size)) >= basic.get(ch)) {
						queue.add(String.valueOf(stack.remove(size)));
						size--;
					}
				}
				if (ch != ')') {
					stack.add(ch);
				} else {
					stack.remove(stack.size() - 1);
				}
			}
			if (i == charArr.length - 1) {
				if (len > 0) {
					queue.add(String.valueOf(Arrays.copyOfRange(charArr, i - len + 1, i + 1)));
				}
				int size = stack.size() - 1;
				while (size >= 0) {
					queue.add(String.valueOf(stack.remove(size)));
					size--;
				}
			}

		}
		return queue.stream().collect(Collectors.joining(","));
	}

	/**
	 * 将 后缀表达式 进行 运算 计算出结果
	 */
	public String dealEquation(String equation) {
		if(equation==null)
			return null;
		String[] arr = equation.split(",");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			int size = list.size();
			switch (arr[i]) {
			case "+":
				int a = Integer.parseInt(list.remove(size - 2)) + Integer.parseInt(list.remove(size - 2));
				list.add(String.valueOf(a));
				break;
			case "-":
				int b1 = Integer.parseInt(list.remove(size - 2));
				int b2 = Integer.parseInt(list.remove(size - 2));
				if (b1 - b2 >= 0) {
					int b = b1 - b2;
					list.add(String.valueOf(b));
				} else
					return null;
				break;
			case "*":
				int c = Integer.parseInt(list.remove(size - 2)) * Integer.parseInt(list.remove(size - 2));
				list.add(String.valueOf(c));
				break;
			case "/":
				int d1 = Integer.parseInt(list.remove(size - 2));
				int d2 = Integer.parseInt(list.remove(size - 2));
				if (d2 != 0 && d1 % d2 == 0) {
					int d = d1 / d2;
					list.add(String.valueOf(d));
				} else
					return null;
				break;
			default:
				list.add(arr[i]);
				break;
			}
		}
		return list.size() == 1 ? list.get(0) : null;
	}
}