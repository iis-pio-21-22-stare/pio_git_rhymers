package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

@Override
public int countout() {
while (!callcheck())

getTemp().countin(super.countout());

int ret = getTemp().countout();

while (!getTemp().callcheck())

countin(getTemp().countout());

return ret;
}

	public DefaultCountingOutRhymer getTemp() {
		return temp;
	}

	public void setTemp(DefaultCountingOutRhymer temp) {
		this.temp = temp;
	}
}
