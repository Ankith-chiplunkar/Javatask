package com.ITO.Assign2.three;

public class EvenThread implements Runnable
{
EvenOdd eo;
	
	public EvenThread(EvenOdd eo) {
		super();
		this.eo = eo;
	}

	@Override
	public void run() {
		eo.even();
	}
}
