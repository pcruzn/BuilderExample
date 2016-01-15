package cl.utfsm.inf.adsw.synthelements;

import cl.utfsm.inf.adsw.abstractclasses.Oscillator;

public class PWMOsc extends Oscillator {
	private int width;
	
	@Override
	public void setFrequency(int freq) {
		this.frequency = freq;		
	}

	@Override
	public void setAmplitude(int amp) {
		this.amplitude = amp;
	}

	@Override
	public void setPhase(int phase) {
		this.phase = phase;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public void play() {
		// play the oscillator
		System.out.println("SinOsc playing with freq: " + this.frequency + "  amp: " + this.amplitude + "  phase: " + this.phase + " width: " + this.width);
	}

	@Override
	public void stop() {
		// stop the oscillator
		System.out.println("SinOsc stopped...");
	}

}
