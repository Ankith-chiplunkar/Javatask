package com.ITO.Assign2.three;

public class OddThread implements Runnable
{
EvenOdd eo;
	
	public OddThread(EvenOdd eo) {
		super();
		this.eo = eo;
	}

	@Override
	public void run() {
		eo.odd();
	}
}
