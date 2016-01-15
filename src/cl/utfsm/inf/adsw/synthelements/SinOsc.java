package cl.utfsm.inf.adsw.synthelements;

import cl.utfsm.inf.adsw.abstractclasses.Oscillator;

public class SinOsc extends Oscillator {
	@Override
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public void setAmplitude(int amplitude) {
		this.amplitude = amplitude;
	}

	@Override
	public void setPhase(int phase) {
		this.phase = phase;
	}

	@Override
	public void play() {
		// play the oscillator
		System.out.println("SinOsc playing with freq: " + this.frequency + "  amp: " + this.amplitude + "  phase: " + this.phase);
	}

	@Override
	public void stop() {
		// stop the oscillator
		System.out.println("SinOsc stopped...");		
	}
}
