package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class persion {
private List<String> friends;
private Map<String,Integer> feestructure;
private Properties props;
public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}



public Map<String, Integer> getFeestructure() {
	return feestructure;
}

public Properties getProps() {
	return props;
}

public void setProps(Properties props) {
	this.props = props;
}

public void setFeestructure(Map<String, Integer> feestructure) {
	this.feestructure = feestructure;
}

@Override
public String toString() {
	return "persion [friends=" + friends + ", feestructure=" + feestructure + ", props=" + props + "]";
}

}
