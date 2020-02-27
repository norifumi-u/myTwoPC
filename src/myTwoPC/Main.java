package myTwoPC;

import java.io.IOException;

import org.scribble.runtime.net.ScribServerSocket;
import org.scribble.runtime.net.SocketChannelServer;

public class Main {

	public static abstract class MyRunnable implements Runnable {
		abstract public void myrun() throws Exception;

		public void run() {
			try {
				myrun();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		try (
				ScribServerSocket c2 = new SocketChannelServer(6666);
				ScribServerSocket p1 = new SocketChannelServer(8888);
				ScribServerSocket p2 = new SocketChannelServer(7777)) {
			var a = new Thread(new MyRunnable() {
				@Override
				public void myrun() throws Exception {
					Consumer1.run();
				}
			});
			var b = new Thread(new MyRunnable() {
				@Override
				public void myrun() throws Exception {
					Consumer2.run(c2);
				}
			});
			var c = new Thread(new MyRunnable() {
				@Override
				public void myrun() throws Exception {
					Producer1.run(p1);
				}
			});
			var d = new Thread(new MyRunnable() {
				@Override
				public void myrun() throws Exception {
					Producer2.run(p2);
				}
			});
			a.start();
			b.start();
			c.start();
			d.start();
			a.join();
			b.join();
			c.join();
			d.join();
		}
	}

}
