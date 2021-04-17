//package com.heart.impl;
//
//// 플레이어 객체, 딜러 객체 만듦
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import com.heart.model.DeckVO;
//
//public class BlackJackRuleImplV2 extends BlackJackRuleimplV1 {
//
//	protected Scanner scan;
//	protected String gamerName; // 게이머 이름
//	protected List<DeckVO> gamerDeck; // 게이머 카드리스트
//	protected List<DeckVO> dealerDeck; // 딜러 카드리스트
//	protected DeckVO deckVO;
//	protected Integer gMoney;
//	protected Integer betMoney;
//	protected boolean g_cBlackjack; // 게이머가 블랙잭인지 아닌지
//	protected boolean d_cBlackjack; // 딜러가 블랙잭인지 아닌지
//	protected boolean g_cBust; // 게이머가 버스트인지 아닌지
//	protected boolean d_cBust; // 딜러가 버스트인지 아닌지
//
//	public BlackJackRuleImplV2() {
//		// TODO 생성자
//		scan = new Scanner(System.in);
//		gamerName = null;
//		gamerDeck = new ArrayList<DeckVO>();
//		dealerDeck = new ArrayList<DeckVO>();
//		gMoney = 10000;
//		g_cBlackjack = false;
//		d_cBlackjack = false;
//		g_cBust = false;
//		d_cBust = false;
//	}
//
//	@Override
//	public void gameMainScreen() {
//		// TODO 게임 첫 화면
//
//		System.out.println("*");
//		System.out.println("*" + "            " + "블랙잭게임" + "            " + "*");
//		System.out.println("*");
//
//		System.out.println("\n현재 겜블러의 재산은" + gMoney + "원 입니다.");
//
//		while (gMoney > 0) {
//			System.out.println("\n" + "-");
//			System.out.println("게임을 시작하시겠습니까?");
//			System.out.println("▷ GO : 게임하기");
//			System.out.println("▷ QUIT : 그만하기");
//			System.out.println("-");
//			System.out.print(" ▷ ");
//			String goQuit = scan.nextLine();
//
//			// 게임 선택
//			if (goQuit.equals("GO")) {
//				this.playScreen();
//			}
//
//			// 게임종료 선택
//			else if (goQuit.equals("QUIT")) {
//				System.out.println("\n게임을 종료합니다.");
//				return;
//			}
//
//			// 잘못입력
//			else {
//				System.out.println("입력은 GO / QUIT 만 가능합니다.");
//				continue;
//			}
//
//		}
//
//		System.out.println("<< GAME OVER!! >>"); // 잔액 0원
//
//	}
//
//	@Override
//	public void playScreen() {
//		// TODO 게임판
//		this.inputGamer();
//		betMoney = this.bettingMoney();
//		gMoney -= betMoney;
//
//		/*
//		 * 카드 배열 만드는 메서드
//		 */
//		suffleDeck(); // 카드 섞기
//		handDeck(); // 게이머 카드 하나 주기
//		handDeck(); // 딜러 카드 하나 주기
//		handDeck(); // 게이머 카드 하나 주기
//		handDeck(); // 딜러 카드 하나 주기
//		checkBJ(); // 블랙잭인지 확인하기
//
//		while(true) {
//			gamerHS();
//			if(g_cBust);
//		}
//		
////		while(true) {
////			dealerHS();
////		}
//		
//		// hitAndStand(); // hit할지 stand할지
//
////		gamerMoney(); // 승패 결정 후 돈계산
//
//	}
//
//	@Override
//	public void inputGamer() {
//		// TODO 게이머 정보 입력
//		gamerName = scan.nextLine();
//		/*
//		 * 유효성 검사하기
//		 */
//		return;
//	}
//
//	@Override
//	public Integer bettingMoney() {
//		while (true) {
//			System.out.println("얼마를 배팅하시겠습니까? (500원 단위로 배팅 가능)");
//			System.out.println(">> ");
//			String strBet = scan.nextLine();
//			/*
//			 * 유효성 검사하기
//			 */
//			int intBet = Integer.valueOf(strBet);
//			if (intBet % 500 == 0) {
//				betMoney = intBet;
//				return betMoney;
//			}
//			if (intBet % 500 != 0) {
//				System.out.println("500원 단위로 배팅 가능합니다");
//				continue;
//			}
//		}
//	}
//
//	@Override
//	public void suffleDeck() {
//		// TODO 카드 섞기
//
//	}
//
//	@Override
//	public void handDeck() {
//		// TODO 카드 1장씩 나눠주기
//
//		return;
//	}
//
//	@Override
//	public void checkBJ() {
//		// TODO 블랙잭 판단
//
//		if (true) {
//			// WIN or PUSH?
//		} else if (false) {
//			// 계속 진행
//		}
//
//	}
//
//	@Override
//	public void hitAndStand() {
//		// 블랙잭 판단 함수 끝나고 
//		// TODO
//		String hOs = null;
//		int sumDeck = 0;
//		DeckVO vo;
//		while (true) {
//			System.out.println("1. hit 2. stand"); // 선택하라는 프롬프트
//			hOs = scan.nextLine(); // 선택
//			if (hOs.equals("1")) { // hit를 선택하면
//				// vo = handDeck();
//				// gamerDeck.add(vo); // 게이머가 카드 하나를 받아서 카드리스트에 카드 하나 추가됨
//				/* 카드 총합 계산 */
//				if (sumDeck > 21)
//					System.out.println("Bust!!");// 만약 카드 총합이 21이 넘어버렸다면 버스트 => 패배
//				continue;
//			} else if (hOs.equals("2")) {
//				// dealerDeck.add(handDeck());
//			}
//		}
//
//	}
//
//	@Override
//	public void gameResult() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void gamerMoney() {
//		// TODO 돈 계산
////		if(true || ) { // 게이머가 블랙잭 true이거나 || 딜러가 bust
////			money_twice();
////		}
////		if()
//
//	}
//
//	public void money_twice() { // 배팅금 2배로 돌려받는 경우
//		// ++ 카드 다 오픈 후 내 점수합이 더 높을 때 (현재산 + 배팅금 * 2)
//		// ++ 게이머 bust 아닌데 딜러가 bust (현재산 + 배팅금 * 2)
//		gMoney += (betMoney * 2);
//	}
//	
//	public void money_bj() { // 블랙잭의 결과로 2.5배 돌려받는 경우
//		// ++ 게이머가 블랙잭 (현재산 + 배팅금 * 2.5)
//		gMoney += (int)(betMoney * 2.5);
//	}
//	
//	public void money_minus() {
//		// -- 게이머 bust (현재산 그대로. 배팅금 잃은 것)
//		return;
//	}
//	
//	public void money_keep() {
//		// == 딜러 게이머 점수 같음 push (현재산 + 배팅금. 배팅금 다시 돌려받은 것)
//		gMoney += betMoney;
//	}
//	
//	public void gamerHS() {
//		System.out.println("1. hit 2. stand");
//		String hs = scan.nextLine();
////		if(hs.equals("1") {
////			
////		} else if
//	}
//	
//	public void dealerHS() {
//		
//	}
//
//}
//
//
//
//// 블랙잭 판단 변수 이름 > boolean cBlackjack > true나 false가 담김
//
