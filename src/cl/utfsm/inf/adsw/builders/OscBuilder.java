package cl.utfsm.inf.adsw.builders;

import cl.utfsm.inf.adsw.abstractclasses.Oscillator;

// the builder knows the operations to 'build' an oscillator
public abstract class OscBuilder {
	public abstract void setFrequency(int freq);
	public abstract void setAmplitude(int amp);
	public abstract void setPhase(int phase);
	public abstract void setWidth(int ratio);
	public abstract Oscillator getOscillator();
}
