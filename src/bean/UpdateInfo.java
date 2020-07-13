package bean;

import org.omg.CORBA.PRIVATE_MEMBER;

public class UpdateInfo {
private String info;
private boolean res;
public String getInfo() {
	return info;
}
public boolean isRes() {
	return res;
}
public void setInfo(String info) {
	this.info = info;
}
public void setRes(boolean res) {
	this.res = res;
}
@Override
public String toString() {
	return "UpdateInfo [info=" + info + ", res=" + res + "]";
}

}
