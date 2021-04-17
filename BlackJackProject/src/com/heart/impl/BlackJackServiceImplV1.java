//package com.heart.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import com.heart.model.DeckVO;
//import com.heart.service.BlackjackRule;
//
//public class BlackJackServiceImplV1 implements BlackjackRule {
//
//	protected Scanner scan;
//	protected List<DeckVO> deckList;
//
//	public BlackJackServiceImplV1() {
//		scan = new Scanner(System.in);
//		deckList = new ArrayList<DeckVO>();
//	}
//
//
//	/*
//	 * 플레이어가 히트를 할 경우 딜러가 히트를 할 경우
//	 */
//	@Override
//	public void hitAndStand() {
//
//		// 플레이어의 카드와 점수
//		for (int i = 0; i < deckList.size(); i++) {
//			DeckVO vo = deckList.get(i);
//			System.out.println(vo.getDeck());
//			System.out.println(vo.getValue());
//		}
//
//		// 딜러의 카드와 점수
//
//		// hit stand 선택지
//		while (true) {
//			System.out.println("=".repeat(50));
//			System.out.println("HIT : 1");
//			System.out.println("STAND : 0");
//			System.out.println("=".repeat(50));
//			System.out.print(">> ");
//			Integer hOs = scan.nextInt();
// 
//			//플레이어
//			Integer gamerC = this.gamerRule(hOs);
//			if(gamerC == null) {
//				break;	
//			} else {
//				DeckVO vo = new DeckVO();
//				//뭔가 해야함
//				deckList.add(vo);
//			}
//			
//			//딜러
//			Integer dealerC = this.dealerRule(hOs);
//		} // while end
//
//	}
//
//	//플레이어의 룰이 적용되는 히트 메서드
//	protected Integer gamerRule(Integer num) {
//		Integer result = null;
//		if (num == 1) {
//			result = this.hit();
//			// 플레이어의 규칙 : 21이상의 점수가 나올 시 Bust
//			if (result > 21) {
//				return null;
//			}
//			// 21이하면 카드리스트에 추가하고 점수 계산하고 다시 히트스탠드로 돌아가기
//		} else if (num == 0) {
//			return null;
//		}
//		return result;
//	}
//	
//	//딜러의 룰이 적용되는 히트 메서드
//	protected Integer dealerRule(Integer num) {
//		Integer result = null;
//		if (num == 1) {
//			result = this.hit();
//			// 딜러의 규칙 : 17이상의 점수가 나올 시 히트 불가능
//			if (result > 17 && result <= 21) {
//				//딜러리스트에 값을 저장하고 vo리턴?
//				return null;
//			} else if (result > 21)
//				return null;
//		} else if (num == 0) {
//			return null;
//		}
//		return result;
//	}
//
//	// TODO 히트하는 메서드
//	protected Integer hit() {
//		// handDeck
//
//		// handDeck 추가
//		// 계산 하기
//
//		// 계산된 점수값을 리턴하기 vo를 리턴하게 될 것 같음 아마...
//		return null;
//	}
//
//
//	@Override
//	public void gameMainScreen() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void playScreen() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void inputGamer() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public Integer bettingMoney() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public void shuffleDeck() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void handDeck(List<DeckVO> list) {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public boolean checkBJ() {
//		return false;
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void gameResult() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//	@Override
//	public void gamerMoney() {
//		// TODO Auto-generated method stub
//		
//	}
//}