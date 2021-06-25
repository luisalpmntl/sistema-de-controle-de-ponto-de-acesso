package com.dio.live.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class NivelDeAcesso {
    private Long id;
    private String descricao;
}
