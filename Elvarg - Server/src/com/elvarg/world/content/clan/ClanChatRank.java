package com.elvarg.world.content.clan;

public enum ClanChatRank {

	FRIEND(-1, 197),
	RECRUIT(0, 198),
	CORPORAL(1, 199),
	SERGEANT(2, 200),
	LIEUTENANT(3, 201),
	CAPTAIN(4, 202),
	GENERAL(5, 203),
	OWNER(-1, 204),
	STAFF(-1, -1);
	
	ClanChatRank(int actionMenuId, int spriteId) {
		this.actionMenuId = actionMenuId;
		this.spriteId = spriteId;
	}
	
	private int spriteId;
	private int actionMenuId;

	public int getSpriteId() {
		return spriteId;
	}
	
	public static ClanChatRank forId(int id) {
		for (ClanChatRank rank : ClanChatRank.values()) {
			if (rank.ordinal() == id) {
				return rank;
			}
		}
		return null;
	}
	
	public static ClanChatRank forMenuId(int id) {
		for (ClanChatRank rank : ClanChatRank.values()) {
			if (rank.actionMenuId == id) {
				return rank;
			}
		}
		return null;
	}
}
