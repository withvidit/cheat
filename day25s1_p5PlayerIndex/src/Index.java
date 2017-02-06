
public class Index implements Comparable<Index> {
 public Index() {
	// TODO Auto-generated constructor stub
}
 Character ch ;
 Integer count; 
 public char getCh() {
	return ch;
}
public Index(char ch, Integer count) {
	this.ch = ch;
	this.count = count;
}
public Integer getCount() {
	return count;
}
public void setCh(char ch) {
	this.ch = ch;
}
public void setCount(Integer count) {
	this.count = count;
}
public int compareTo(Index arg0) {
	if (this.getCh()>arg0.getCh()) {
		return 1;
	}
	else if (this.getCh()<arg0.getCh()) {
		return -1;
	}
	else {
		return 0;
	}
}


//public int compareTo(Object o) {
//	// TODO Auto-generated method stub
//	return 0;
//}

}
