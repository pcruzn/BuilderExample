package cl.utfsm.inf.adsw.abstractclasses;

// this class represents an oscillator
// both, pwm oscillator and sin oscillator, are subclasses of this
public abstract class Oscillator {
	protected int frequency;
	protected int amplitude;
	protected int phase;
	public abstract void setFrequency(int freq);
	public abstract void setAmplitude(int amp);
	public abstract void setPhase(int phase);
	public abstract void play();
	public abstract void stop();
}
