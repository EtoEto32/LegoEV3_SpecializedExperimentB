package jp.ac.kanazawait.ep.Kainuma;

import jp.ac.kanazawait.ep.majorlabB.driver.AbstDriver;

/**
 * 堅実な走行を行うドライバークラス
 * @author mmotoki
 *
 */
public class KainumaNaiveDriver extends AbstDriver {

	final int speedNormal = 430;
	final int speedVeryLow = 45; // 追加: より低い速度設定

	/**
	 * 左モーターを "B" に，右モーターを "C" に接続した状態のコンストラクタ
	 */
	public KainumaNaiveDriver() {
		this("B", "C");
	}

	/**
	 *
	 * @param portLeft	左モーターを接続したポート（"A"～"D"の４つのいずれか）
	 * @param portRight	右モーターを接続したポート（"A"～"D"の４つのいずれか）
	 */
	public KainumaNaiveDriver(String portLeft, String portRight) {
		setMotor(portLeft, portRight);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void goStraight() {
		setSpeed(speedNormal);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void turnLeft() {
		setSpeed(speedVeryLow, speedNormal);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void turnRight() {
		setSpeed(speedNormal, speedVeryLow);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void turnLeftSharply() {
		// 実装する場合は，次の throw を消す
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + "ではこのメソッドを実装していません");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void turnRightSharply() {
		// 実装する場合は，次の throw を消す
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + "ではこのメソッドを実装していません");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void turnLeftGently() {
		// 実装する場合は，次の throw を消す
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + "ではこのメソッドを実装していません");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void turnRightGently() {
		// 実装する場合は，次の throw を消す
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + "ではこのメソッドを実装していません");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void increaseSpeed() {
		// 実装する場合は，次の throw を消す
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + "ではこのメソッドを実装していません");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void decreaseSpeed() {
		// 実装する場合は，次の throw を消す
		throw new UnsupportedOperationException(this.getClass().getSimpleName() + "ではこのメソッドを実装していません");
	}

}
